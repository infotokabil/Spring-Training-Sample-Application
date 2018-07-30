package bridgeExample;

class WindowsOS extends Computer
{
public WindowsOS(OS os) 
{
super(os);
}

@Override
void useOS() 
{
os.AccessingWay1();
}
}
