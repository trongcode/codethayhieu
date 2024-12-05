public class quicksorting {

    // Phương thức chính để sắp xếp mảng
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Tìm chỉ số phân vùng
            int partitionIndex = partition(array, low, high);
            
            // Đệ quy sắp xếp các phần tử trước và sau chỉ số phân vùng
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Phương thức để phân vùng mảng
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Chọn phần tử cuối làm pivot
        int i = low - 1; // Chỉ số cho phần tử nhỏ hơn

        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (array[j] <= pivot) {
                i++; // Tăng chỉ số cho phần tử nhỏ hơn
                // Hoán đổi array[i] và array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Hoán đổi array[i + 1] và array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Trả về chỉ số của pivot
    }

    // Phương thức để in mảng
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Phương thức main để kiểm tra thuật toán
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Mảng ban đầu:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(array);
    }
}
