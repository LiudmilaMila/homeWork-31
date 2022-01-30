public class UnitChangeTask {

    public static String changeUnit(long value) {

        long remainder = value;
        long year = remainder / 31536000;
        remainder = remainder % 31536000;
        long day = remainder / 86400;
        remainder = remainder % 86400;
        long hour = remainder / 3600;
        remainder = remainder % 3600;
        long minute = remainder / 60;
        remainder = remainder % 60;
        long second = remainder;

        String result = year + " years " +
                day + " days " + hour + " hours " + minute + " minutes " +
                second + " seconds ";
        return result;
    }
}
