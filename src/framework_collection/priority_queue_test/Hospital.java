package framework_collection.priority_queue_test;

import java.util.PriorityQueue;

public class Hospital {
    public static void main(String[] args) {
        PriorityQueue<Paciente> filaAtendimento = new PriorityQueue<>();

        filaAtendimento.offer(new Paciente("Ana", 2)); // Urgente
        filaAtendimento.offer(new Paciente("João", 3)); // Estável
        filaAtendimento.offer(new Paciente("Maria", 1)); // Crítico
        filaAtendimento.offer(new Paciente("Carlos", 2)); // Urgente

        System.out.println("Removendo pacientes críticos:");
        filaAtendimento.removeIf(paciente -> paciente.getPrioridade() == 1);

        System.out.println("Fila de atendimento atualizada:");
        for (Paciente paciente : filaAtendimento) {
            System.out.println(paciente);
        }

        System.out.println();

        System.out.println("Ordem de atendimento:");
        while (!filaAtendimento.isEmpty()) {
            Paciente paciente = filaAtendimento.poll();
            System.out.println(paciente);
        }

    }
}
