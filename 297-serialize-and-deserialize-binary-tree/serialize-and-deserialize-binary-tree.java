

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                sb.append("null,");
                continue;
            }

            sb.append(node.val).append(",");

            q.offer(node.left);
            q.offer(node.right);
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] arr = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int index = 1;

        while (!q.isEmpty() && index < arr.length) {
            TreeNode node = q.poll();

            // Left child
            if (!arr[index].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(arr[index]));
                q.offer(node.left);
            }
            index++;

            // Right child
            if (index < arr.length && !arr[index].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(arr[index]));
                q.offer(node.right);
            }
            index++;
        }

        return root;
    }
}