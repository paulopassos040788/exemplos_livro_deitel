package framework_collection.priority_queue_test;

public class Paciente implements Comparable<Paciente>{

    private String nome;
    private int prioridade; // 1: crítico, 2: urgente, 3: estável

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Paciente() {}

    @Override
    public int compareTo(Paciente outro) {
        return Integer.compare(this.prioridade, outro.prioridade);
    }

    @Override
    public String toString() {
        return nome + " (Prioridade: " + prioridade + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

}
