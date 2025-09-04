
public class Atom
{
    int m_protons;
    int m_neutrons;
    int m_electrons;
    String m_name;

    public Atom(String name, int protons, int neutrons, int electrons)
    {
        m_name = name;
        m_protons = protons;
        m_neutrons = neutrons;
        m_electrons = electrons;
    }
    public int atomicNumber(){
        return m_protons;
    }
    public int atomicMass(){
        return m_protons+m_neutrons;
    }
    public String charge(){
        int charge = m_protons-m_electrons;
        String retval= "";
        if (charge>0)retval="cation";
        else if (charge<0)retval="anion";
        else retval="neutral";
        return retval;
    }
    public String toString(){
        String retval = String.format("Element Name: %s \nAtomic Number: %d \nAtomic Mass: %d \nCharge: %s",m_name,atomicNumber(),atomicMass(),charge());
        return retval;
    }

}
