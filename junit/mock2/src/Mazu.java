public class Mazu {
    private int year;

    public Mazu(int year) {
        this.year = year;
    }

    public void showMercyInDream(Dream dream, String receiverName, int mounth, int date) {
        dream.setReceiver(receiverName);
        dream.setDate(year, mounth, date);
        dream.show();
    }
}