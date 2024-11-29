import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest{

    @Test
    public void TestBFS1() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(6);
        tree.insert(11);
        tree.insert(9);
        tree.insert(13);
        tree.insert(4);
        tree.insert(7);

        tree.BFS();

        Object[] expected = {10, 8, 12, 6, 9, 11, 13, 4, 7};
        assertArrayEquals(expected, tree.getVisitedNodes().toArray());
    }

    @Test
    public void TestBFS2() {
        BinarySearchTree tree = new BinarySearchTree(100);
        tree.insert(10);
        tree.insert(1000);
        tree.insert(1100);
        tree.insert(0);
        tree.insert(110);
        tree.insert(-10);

        tree.BFS();

        Object[] expected = {100, 10, 1000, 0, 110, 1100, -10};
        assertArrayEquals(expected, tree.getVisitedNodes().toArray());
    }

    @Test
    public void TestBFS3() {
        BinarySearchTree tree = new BinarySearchTree(0);
        tree.insert(-500);
        tree.insert(-82970);
        tree.insert(-321);
        tree.insert(5);
        tree.insert(934266);
        tree.insert(-1);

        tree.BFS();

        Object[] expected = {0, -500, 5, -82970, -321, 934266, -1};
        assertArrayEquals(expected, tree.getVisitedNodes().toArray());
    }

    @Test
    public void TestPreorder1()
    {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(6);
        tree.insert(11);
        tree.insert(9);
        tree.insert(13);
        tree.insert(4);
        tree.insert(7);

        tree.preorder();

        Object[] expected = {10, 8, 6, 4, 7, 9, 12, 11, 13};
        assertArrayEquals(expected, tree.getVisitedNodes().toArray());
    }

    @Test
    public void TestPreorder2()
    {
        BinarySearchTree tree = new BinarySearchTree(100);
        tree.insert(10);
        tree.insert(1000);
        tree.insert(1100);
        tree.insert(0);
        tree.insert(110);
        tree.insert(-10);

        tree.preorder();

        Object[] expected = {100, 10, 0, -10, 1000, 110, 1100};
        assertArrayEquals(expected, tree.getVisitedNodes().toArray());
    }

    @Test
    public void TestPreorder3()
    {
        BinarySearchTree tree = new BinarySearchTree(0);
        tree.insert(-500);
        tree.insert(-82970);
        tree.insert(-321);
        tree.insert(5);
        tree.insert(934266);
        tree.insert(-1);

        tree.preorder();

        Object[] expected = { 0, -500, -82970, -321, -1, 5, 934266};
        assertArrayEquals(expected, tree.getVisitedNodes().toArray());
    }

}
