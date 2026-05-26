// class Floor {
//     public static int floor(Node root, int x) {

//         int floor = -1; // to store answer

//         while (root != null) {

//             if (root.data == x) {
//                 return root.data; // exact match
//             }

//             if (root.data < x) {
//                 floor = root.data; // possible floor
//                 root = root.right; // try to find larger value
//             } else {
//                 root = root.left; // move left
//             }
//         }

//         return floor; // return best found value
//     }
// }

// Ceil = smallest value ≥ X

// Rules:
// If node == x → return it
// If node > x → store it and go left
// If node < x → go right
// At end → return stored ceil

// class Solution {
//     int findCeil(Node root, int x) {

//         int ceil = -1; // to store answer

//         while (root != null) {

//             if (root.data == x) {
//                 return root.data; // exact match
//             }

//             if (root.data > x) {
//                 ceil = root.data; // possible ceil
//                 root = root.left; // try to find smaller value
//             } else {
//                 root = root.right; // move right
//             }
//         }

//         return ceil; // return best found value
//     }
// }
