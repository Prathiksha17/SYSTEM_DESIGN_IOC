class Main{
    public static void main(String []args){
        VideoAdapter adp = new VideoAdapter(new OutDatedVideoPlayer());
        adp.load("sece.mp4");
    }
}