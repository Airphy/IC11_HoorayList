public class HoorayList <E>{ // E is a place holder for when we declare the data structure

    private static final int DEFAULT_CAPACITY = 10;
    private int mSize;
    private int mCapacity;

    private E[] mData; /// The mData is an array of the datatype that is passed in by the user, E.
    // ArrayList<Cat> clowder = new ArrayList<>(); <----- uses the default constructor.
    // ArrayList<String> ourNames = new ArrayList<>(29); <----- parameterized constructor, changes the capacity to 29.

    //Default Constructor
    public HoorayList()
    {
        this(DEFAULT_CAPACITY);
    }

    public HoorayList(int capacity)
    {
        mCapacity = capacity;
        mSize = 0;
        //Initialize our array(mData) with length 10
        mData = (E[]) new Object[mCapacity]; //Object encompasses everything, then we downcast to E[] to specify.

    }

    public E get(int index)
    {
        if(index < 0 || index >= mSize)
            throw new IndexOutOfBoundsException("Index must be >= 0 and < " + mSize);
        return mData[index];
    }

    public E set(int index, E element)
    {

        E temp = this.get(index); // old val , done this way over mData[index] so we can reuse the error
        mData[index] = element; // replaces with a new val
        return temp;
    }

    public boolean add(E element)
    {
        // adds to the end of the HoorayList
        if(mSize >= mCapacity)// Check if it is full
        {
            //double capacity
            E[] newData = (E[]) new Object[mCapacity * 2];
            //copy all old values to the new array
            for (int i = 0; i < mSize; i++) {
                newData[i] = mData[i];
            }
            // Update mData to the newData
            mData = newData;
            //Update Capacity
            mCapacity *= 2;
        }

            mData[mSize++] = element; // if mSize is 0, will store into 0 and then the size will be 1 and youll store after.


        return true; /// can always add so always true
    }

    public E remove(int index)
    {
        E temp = mData[index];
        for (int i = index; i < mSize; i++) {

            mData[i] = mData[i+1];

        }
        // Make size go down by 1 because we removed
        mSize--;
        return temp;
    }

    public void clear()
    {
        // Start a new array
        mData = (E[]) new Object[mCapacity];
    }



    @Override
    public String toString() {
        String output = "[";
        /// Loop through the array and concatenate the data

        for (int i = 0; i < mSize; i++) {
            output += mData[i] + ", ";
        }
        output+= "Hooray!]";
        return output;
    }
}
