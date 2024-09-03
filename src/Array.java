public class Array {

    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];

    }



    public void insert(int item){

        // if the array is full, we need to resize it
        if (items.length == count){
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }

            // Set "Items" to this new array
            items = newItems;
        }

        // and also add the new item at the end
        items[count++] = item;

    }

    public void removeAt(int index){

        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();


        //Shift the item to the left to fill the hole
        // [10, 20, 30, 40]
        // remove index 1, which means 20
        // then 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];


        count--;
    }








    public void print(){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }







}
