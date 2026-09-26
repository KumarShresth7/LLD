package model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import enums.GateType;


@Getter 
@AllArgsConstructor 

public abstract class Gate{
    protected final String id;
    public abstract GateType getType();
}