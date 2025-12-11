class RealVideo implements Video{
    private String fileName;
    public RealVideo(String fileName){
        this.fileName = fileName;
        
    }
    public void loadFromInternet (){
        System.out.println("Loading video...." + fileName);
    }
    public void play(){
        loadFromInternet();
        System.out.println("Playing video...."+ fileName);
    }
}