import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Introspector_3 {
    public static void main(String[] args) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                System.out.println(propertyDescriptor.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Student {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
