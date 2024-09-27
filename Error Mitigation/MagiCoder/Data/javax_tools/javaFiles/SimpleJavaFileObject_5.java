import javax.tools.*;
import java.io.*;

public class SimpleJavaFileObject_5 {
    public static void main(String[] args) throws IOException {
        JavaFileManager fileManager = new MyJavaFileManager();
        SimpleJavaFileObject fileObject = new MyJavaFileObject("Hello.java", Kind.SOURCE);
        try (OutputStream outputStream = fileObject.openOutputStream()) {
            outputStream.write("public class Hello { public static void main(String[] args) { System.out.println(\"Hello, world!\"); } }".getBytes());
        }
    }
}

class MyJavaFileManager extends ForwardingJavaFileManager<JavaFileManager> {
    public MyJavaFileManager() {
        super(ToolProvider.getSystemJavaCompiler().getStandardFileManager(null, null, null));
    }

    @Override
    public JavaFileObject getJavaFileForOutput(Location location, String className, Kind kind, FileObject sibling) {
        return new MyJavaFileObject(className, kind);
    }
}

class MyJavaFileObject extends SimpleJavaFileObject {
    private final String content;

    public MyJavaFileObject(String className, Kind kind) {
        super(URI.create("string:///" + className.replace('.', '/') + kind.extension), kind);
        this.content = "";
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) {
        return content;
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        return new ByteArrayOutputStream() {
            @Override
            public void close() throws IOException {
                content = toString();
                super.close();
            }
        };
    }
}
