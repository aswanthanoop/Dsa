public class hourFormat {
    public static String timeConversion(String s) {
        // Write your code here
        String[] arr = s.split(":");
        String hour = arr[0];
        String min = arr[1];
        String sec = arr[2];
        String ampm = arr[2].substring(2);
        
        if(ampm.equals("AM") && hour.equals("12")){
            hour = "00";
        } else if(ampm.equals("PM")){
            if(!hour.equals("12")){
                hour = String.valueOf(Integer.parseInt(hour) + 12);
            }
        }
        return String.format("%02d:%s:%s",Integer.parseInt(hour),min,sec.substring(0,2));
        
        
            
    
        }
}
