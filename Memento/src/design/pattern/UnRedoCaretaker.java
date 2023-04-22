package design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang on 2023/4/22.
 */
// 负责undo和redo操作执行的类
public class UnRedoCaretaker {
    //    undo操作使用的备忘录列表
    private final List<Memento> undoList;
    //    redo操作使用的备忘录列表
    private final List<Memento> redoList;

    public UnRedoCaretaker() {
        undoList=new ArrayList<>();
        redoList=new ArrayList<>();
    }

    public void addMemento(Memento memento){
//    undoList添加新的备忘录之前，删除redo操作备忘录列表中的备忘录
        if (redoList.size() > 0) {
            redoList.subList(0, redoList.size()).clear();
        }
        undoList.add(memento);
    }
    /*undoList中的最后一个memento代表当前状态*/
    public Memento undo(){
        Memento result=null;
        if (undoList.size()>1){
            /*获取undoList中的倒数第二个memento，才是需要返回的状态*/
            result=undoList.get(undoList.size()-2);
            /*将undoList中的表示当前状态的memento，存储至redoList中 */
            redoList.add(undoList.get(undoList.size()-1));
            /*将undoList中的表示当前状态的memento移除*/
            undoList.remove(undoList.size()-1);
        }else {
            System.out.println("fail to undo operation!");
        }
        return result;
    }
    public Memento redo(){
        Memento result=null;
        if(redoList.size()>0){
            result=redoList.get(redoList.size()-1);
            undoList.add(result);
            redoList.remove(redoList.size()-1);
        }else {
            System.out.println("fail to redo operation!");
        }
        return result;
    }
}

