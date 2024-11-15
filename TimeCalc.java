public class TimeCalc {
    public static void main(String[] args) {
        // Getting all inputs :
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); 
        int minutesToAdd = Integer.parseInt(args[1]);
        // Calculating the amount of hours to add :
        int totalMinutes = (hours*60) + minutes + minutesToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes - (totalHours * 60);
        // Making up a new string for the hours and minutes respectively. Adding a '0' and the start if needed :
        String stringHours = String.valueOf(newHours),  stringMinutes = String.valueOf(newMinutes);
        if (newHours <=9) {
            stringHours = "0"+String.valueOf(newHours);
        }
        if (newMinutes <= 9) {
            stringMinutes = "0"+String.valueOf(newMinutes);            
        }
        // Printing final value :
        System.out.println(stringHours+":"+stringMinutes);
}
}