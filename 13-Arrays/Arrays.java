public class Arrays{
    public int[] frontPiece(int[] nums) {
  if(nums.length < 2)
       return nums;
  else
    {
   int[] newArray = {nums[0], nums[1]};
   return newArray;
    }

    public int sum13(int[] nums){
    int x =0;
    for (int y = 0;y <nums.length ;y++)
        {
    if (nums[y] != 13)
       x+=nums[y];
    else if (nums[y] == 13 && y < nums.length -1 ) {
       nums[y]=0;
       nums[y+1] =0; }
       
  }
    return x;
     }
    }
}
