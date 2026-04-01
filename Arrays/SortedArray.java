package Arrays;

public class SortedArray extends Array<Integer> {

    public SortedArray(int capacity) {
        this.array = new Integer[capacity];
        this.size = 0;
    }

    public void add(Integer element) {
        if (this.size == this.array.length || element == null) {
            return;
        }

        // Insere primeiro elemento do array
        if (this.size == 0) {
            this.array[0] = element;
            this.size++;
            return;
        }

        // Busca índice onde será inserido
        int insertIndex = -1;
        for (int i = 0; i < this.size; i++) {
            if (element < this.array[i]) {
                insertIndex = i;
                break;
            }
        }

        // Insere no fim do array
        if (insertIndex < 0) {
            this.array[this.size] = element;
            size++;
            return;
        }

        // Organiza o array para inserir o elemento no meio
        for (int i = this.size; i > insertIndex; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[insertIndex] = element;

        this.size++;
    }
}
