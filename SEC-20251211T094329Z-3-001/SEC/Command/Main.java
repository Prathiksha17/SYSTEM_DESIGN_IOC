class Main{
    public static void main(String [] arg){
        OffLight off = new  OffLight(new Light());
        OnLight on = new  OnLight(new Light());
        Button b1 = new Button(off);
        Button b2 = new Button(on);
        // b1.onClick();
        b2.onClick();
    }
}