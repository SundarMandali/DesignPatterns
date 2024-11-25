package structural.composite;

public class Main {
    public static void main(String[] args) {
        // Create leaf nodes (files)
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Create composite nodes (directories)
        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");

        // Build the tree structure
        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(file3);

        Directory root = new Directory("Root");
        root.addComponent(dir1);
        root.addComponent(dir2);

        // Display the structure
        root.showDetails();
    }
}
