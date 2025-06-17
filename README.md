# 🥀 menuFloricultura

Sistema de gerenciamento de estoque para floriculturas, desenvolvido em Java.  
O sistema permite cadastrar plantas, consultar o estoque, repor itens com baixa quantidade e listar todas as plantas cadastradas, auxiliando no controle eficiente do estoque.

---

## 💻 Funcionalidades

- ✅ Cadastro de plantas com:
  - Nome
  - Tipo
  - Valor da unidade
  - Quantidade em estoque
  - Estoque ideal

- 🔍 Consulta por nome da planta  
- 🔄 Reposição automática com cálculo de custo total  
- 📋 Listagem completa de todas as plantas cadastradas  
- ❌ Prevenção de estoques abaixo do ideal

---

## 📂 Estrutura do Projeto
Exercicio7/
├── Main.java # Classe principal com o menu de interação
├── menuFloricutura.java # Lógica de gerenciamento e controle de estoque
├── Plantas.java # Classe que representa cada planta
└── contractsPlantas.java # Interface que define as operações do sistema

---

## 🛠️ Tecnologias Utilizadas

- Java ☕  
- Orientação a Objetos (POO)  
- Estrutura de dados (ArrayList)  
- Scanner para entrada de dados no console  

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/peixotim/menuFloricultura.git


📝 Observações

O sistema é totalmente interativo via terminal.
Ao cadastrar uma planta com estoque abaixo do ideal, o sistema oferece uma opção imediata de reposição com cálculo de custo.
A quantidade de plantas cadastradas é dinâmica (sem limite fixo).


📸 Demonstração


========== 🌿 Menu Floricultura 🌿 ==========
1️⃣  Cadastrar nova planta
2️⃣  Repor estoque de uma planta
3️⃣  Consultar planta específica
4️⃣  Listar todas as plantas
5️⃣  ❌ Sair
=============================================
