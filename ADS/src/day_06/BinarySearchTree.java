package day_06;

class node {

    node left;
    int data;
    node rigtht;
    
    public node(int data) {
        this.left = null;
        this.data = data;
        this.rigtht = null;
    }
    
}

public class BinarySearchTree {
    
    node root = null;

    public node insertNode(node root, int val) {
        if (root == null) {
            return new node(val);
        } else if (root.data < val) {
            root.rigtht = insertNode(root.rigtht, val);
        } else {
            root.left = insertNode(root.left, val);
        }
        return root;
    }

    public boolean search(node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (root.data < val) {
            return search(root.rigtht, val);
        } else {
            return search(root.left, val);
        }
    }

    public void inorder(node root) {//  sorted oredre deto only in inorder madhe
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.rigtht);
        
    }

    public void preorder(node root) {
        if (root == null) {
            return;
        }
        
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.rigtht);
        
    }

    public void postrder(node root) {
        if (root == null) {
            return;
        }
        postrder(root.left);
        
        postrder(root.rigtht);
        System.out.println(root.data);
        
    }

    public node delete(node root, int val) {
        if (root == null) {
            return null;
        } else if (root.data < val) {
            root.rigtht = delete(root.rigtht, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null && root.rigtht == null) {
                return null;
            } else if (root.left == null) {
                return root.rigtht;
            } else if (root.rigtht == null) {
                return root.left;
            } else {
                int rightMin = getRightMin(root.rigtht);
                root.data = rightMin;
                root.rigtht = delete(root.rigtht, rightMin);
                
            }
            
        }
        return root;
    }

    private int getRightMin(node rigtht) {
        node temp = rigtht;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.root = bst.insertNode(bst.root, 100);
        bst.root = bst.insertNode(bst.root, 50);
        bst.root = bst.insertNode(bst.root, 10);
        bst.root = bst.insertNode(bst.root, 60);
        bst.root = bst.insertNode(bst.root, 250);
        bst.root = bst.insertNode(bst.root, 150);
        bst.root = bst.insertNode(bst.root, 300);
        
        System.out.println("Before deleting ");
        bst.inorder(bst.root);
        System.out.println(bst.search(bst.root, 50));

        // bst.delete(bst.root, 60);
        System.out.println("After deleting ");
        
        bst.inorder(bst.root);
        System.out.println("pretorder*********************************************");
        bst.postrder(bst.root);
        System.out.println("postrder*********************************************");
        bst.preorder(bst.root);
    }
    
}
