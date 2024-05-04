import Books.Book;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class LibraryGUI {
    private JFrame frame;
    private JTree tree;
    private DefaultTreeModel model;

    public LibraryGUI(Library library) {
        List<AbstractHuman> users = library.getUsers();
        frame = new JFrame("Library Records");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Library");
        model = new DefaultTreeModel(root);
        organizeData(root, users);

        tree = new JTree(model);
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void organizeData(DefaultMutableTreeNode root, List<AbstractHuman> users) {
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Students");
        DefaultMutableTreeNode tutorsNode = new DefaultMutableTreeNode("Tutors");

        for (AbstractHuman user : users) {
            DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user.getInfo());

            Map<String, DefaultMutableTreeNode> booksByLanguage = new HashMap<>();
            booksByLanguage.put("Russian", new DefaultMutableTreeNode("Russian Books"));
            booksByLanguage.put("English", new DefaultMutableTreeNode("English Books"));

            for (Book book : user.getBooks()) {
                String bookInfo = book.getInfo();
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(bookInfo);
                booksByLanguage.get(book.getLanguage()).add(bookNode);
            }

            // Add nodes if they contain books
            if (!booksByLanguage.get("Russian").isLeaf()) {
                userNode.add(booksByLanguage.get("Russian"));
            }

            if (!booksByLanguage.get("English").isLeaf()) {
                userNode.add(booksByLanguage.get("English"));
            }

            if (user instanceof Student) {
                studentsNode.add(userNode);
            } else if (user instanceof Tutor) {
                tutorsNode.add(userNode);
            }
        }

        root.add(studentsNode);
        root.add(tutorsNode);
    }

}
