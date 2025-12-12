class Button {
    Command command;
    public Button(Command command){
        this.command = command;
    }
    public void onClick(){
        command.execute();
    }
}