class Persist {
	public static int persistence(long n) {
    int count = 0;
    String s = Long.toString(n);
    String[] arr = s.split("");
    long ctr = 1;
	  if(n < 10){
      return 0;
    }
    else{
      do{
        ctr = 1;
        for(int i = 0; i < arr.length; i++){
          ctr *= Long.parseLong(arr[i]);
          
        }
        s = Long.toString(ctr);
        arr = s.split("");
        count++;
      }while(ctr >= 10);
      System.out.println(ctr);
      if(ctr < 10){
        return (int)count;
      }
    }
    return -1;
	}
}
