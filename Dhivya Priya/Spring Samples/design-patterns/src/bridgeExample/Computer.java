package bridgeExample;

abstract class Computer
{
OS os;
public Computer(OS os) 
{
this.os=os;
}
abstract void useOS();
}
