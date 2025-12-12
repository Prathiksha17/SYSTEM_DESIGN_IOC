class VideoAdapter implements VideoPlayer{
    private OutDatedVideoPlayer oldplayer;
    public VideoAdapter(OutDatedVideoPlayer oldplayer){
        this.oldplayer = oldplayer;
    }
    public void load(String fileName){
        System.out.println("Loading from internet" + fileName);
        oldplayer.playVideo(fileName);
    }  

}