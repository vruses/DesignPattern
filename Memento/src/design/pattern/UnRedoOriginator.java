package design.pattern;

/**
 * Created by huang on 2023/4/22.
 */
// 发起人,负责创建和设置备忘录的状态
public class UnRedoOriginator {
    private String state;
    private final UnRedoCaretaker unRedoCaretaker;

    public UnRedoOriginator() {
        unRedoCaretaker=new UnRedoCaretaker();
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void setAndStoreState(String state){
        this.setState(state);
        unRedoCaretaker.addMemento(this.createMemento());
    }
    public void undo(){
        Memento memento=unRedoCaretaker.undo();
        if (memento!=null){
            System.out.println(memento.getState());
        }
    }
    public void redo(){
        Memento memento=unRedoCaretaker.redo();
        if (memento!=null) {
            System.out.println(memento.getState());
        }
    }
}

