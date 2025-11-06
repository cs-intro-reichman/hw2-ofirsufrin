public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int HH = Integer.parseInt(time.substring(0, 2));
        int MM = Integer.parseInt(time.substring(3, 5));
        int Totalminutes = (HH * 60) + MM + minutesToAdd;
        int Totalhours = (Totalminutes / 60);
        int Newhours = Totalhours % 24;
        int Newminutes = Totalminutes - (Totalhours * 60);

        if (Newhours < 10) {
            System.out.print("0" + Newhours + ":");
        } else {
            System.out.print(Newhours + ":");
        }

        if (Newminutes < 10) {
            System.out.print("0" + Newminutes);
        } else {
            System.out.print(Newminutes);
        }

    }
}
