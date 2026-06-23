class Solution {
    public void reverseString(char[] arr) {
        int l=0;
        int r=arr.length-1;
      while(l<r){
        char temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
        l++;
        r--;
      }
    }
}