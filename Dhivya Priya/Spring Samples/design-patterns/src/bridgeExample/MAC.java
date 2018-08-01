package bridgeExample;

class MAC extends Computer
{
public MAC(OS os) 
{
super(os);
}

@Override
void useOS() 
{
os.AccessingWay2();
}
}
