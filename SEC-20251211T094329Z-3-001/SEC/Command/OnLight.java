class OnLight implements Command{
    public Light light;
    public OnLight(Light light){
        this.light = light;
    }
    public void execute(){
        this.light.turnOnLight();
    }
}