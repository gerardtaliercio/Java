public static int linearSearch(int[] a, int first, int upto, int key)
{
    
    for (int i = first; i < upto; i++) {
        if (key == a[i]) {
            return i;  // Found key, return index.
        }
    }
    return -1;        // Failed to find key
}