package Message;

public class NTMessage extends NetMessage {

    private MsgType type;

    public NTMessage(MsgType t) {
        type = t;
    }

    @Override
    public MsgType getMsgType() {
        return type;
    }

    @Override
    public visidia.simulation.process.messages.Message clone() {
        return new NTMessage(type);
    }

    @Override
    public String toString() {
        return type.toString();
    }

    @Override
    public String getData() {
        return this.toString();
    }

}
