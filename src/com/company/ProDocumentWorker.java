package com.company;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    String EditDocument() {
        return "Документ отредактирован";
    }

    @Override
    String SaveDocument() {
        return "Документ сохранен в старом формате," +
                " сохранение в остальных форматах доступно в версии Эксперт";
    }

}
