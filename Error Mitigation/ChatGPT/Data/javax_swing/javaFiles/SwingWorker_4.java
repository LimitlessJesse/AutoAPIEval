import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class SwingWorker_4 {
    public static void main(String[] args) {
        DefaultTableModel tableModel = new DefaultTableModel();
        TableSwingWorker worker = new TableSwingWorker(tableModel);
        worker.execute();
    }

    static class TableSwingWorker extends SwingWorker<DefaultTableModel, Object[]> {
        private final DefaultTableModel tableModel;

        public TableSwingWorker(DefaultTableModel tableModel) {
            this.tableModel = tableModel;
        }

        @Override
        protected DefaultTableModel doInBackground() throws Exception {
            // Simulating loading data
            Object[] row1 = {"1", "John"};
            Object[] row2 = {"2", "Doe"};
            publish(row1, row2);
            return tableModel;
        }

        @Override
        protected void process(List<Object[]> chunks) {
            for (Object[] row : chunks) {
                tableModel.addRow(row);
            }
        }
    }
}
