# 🎓 Sistema de Gestão de Notas de Estudantes

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

Um sistema completo para gerenciar notas de estudantes, calcular médias e determinar aprovações de forma automatizada.

## 📋 Sobre o Projeto

Este sistema foi desenvolvido como parte dos estudos de **Programação Orientada a Objetos** em Java. Ele demonstra conceitos fundamentais como:

- ✨ **Encapsulamento** - Atributos privados com getters/setters
- 🏗️ **Construtores** - Inicialização adequada de objetos
- 📊 **Collections** - Uso de ArrayList para gerenciar dados
- 🔄 **Override de métodos** - toString() personalizado
- 📥 **Entrada de dados** - Interface com usuário via Scanner

## 🚀 Funcionalidades

- 📝 **Cadastro de estudantes** com nome e duas notas
- 🧮 **Cálculo automático** de médias
- ✅ **Identificação de aprovados** (média ≥ 6.0)
- 📊 **Relatório completo** com estatísticas
- 🎯 **Interface intuitiva** via console

## 💻 Como Executar

### Pré-requisitos
- Java 8 ou superior
- IDE de sua preferência (Eclipse, IntelliJ, VS Code)

### Execução
1. Clone o repositório
```bash
git clone https://github.com/AmandaLeopoldoo/sistema-notas-estudantes.git
```

2. Abra o projeto na sua IDE

3. Execute a classe `Program.java`

4. Siga as instruções no console

## 📱 Exemplo de Uso

```
Quantos estudantes? 3

Estudante #1
Nome: Ana Silva
Nota 1: 8.5
Nota 2: 7.0

Estudante #2
Nome: João Santos
Nota 1: 5.0
Nota 2: 4.5

Estudante #3
Nome: Maria Costa
Nota 1: 9.0
Nota 2: 8.5

=== RESULTADO FINAL ===
Estudantes aprovados:
Ana Silva - Média: 7.75 (APROVADO)
Maria Costa - Média: 8.75 (APROVADO)

Resumo:
Total de estudantes: 3
Aprovados: 2
Reprovados: 1
```

## 🏗️ Arquitetura

```
src/
├── application/
│   └── Program.java        # Classe principal com interface do usuário
└── entities/
    └── Estudante.java      # Modelo de dados do estudante
```

### Classes Principais

#### `Estudante`
- **Atributos:** nome, nota1, nota2
- **Métodos:** calcularMedia(), isAprovado(), getSituacao()
- **Encapsulamento:** Getters e setters para todos os atributos

#### `Program`
- **Responsabilidade:** Interface com usuário e controle do fluxo
- **Funcionalidades:** Entrada de dados, processamento e exibição de resultados

## 🎯 Regras de Negócio

| Situação | Critério | Status |
|----------|----------|---------|
| **Aprovado** | Média ≥ 6.0 | ✅ |
| **Reprovado** | Média < 6.0 | ❌ |

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 8+
- **Conceitos:** POO, Collections, Exception Handling
- **Entrada:** Scanner
- **Saída:** Console

## 📚 Conceitos Aplicados

- **Encapsulamento:** Proteção dos dados da classe
- **Abstração:** Métodos que escondem a complexidade
- **Polimorfismo:** Override do método toString()
- **Collections:** ArrayList para gerenciar listas
- **Formatação:** String.format() para saída elegante

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 👩‍💻 Autora

**Amanda Leopoldo**
- GitHub: [@AmandaLeopoldoo](https://github.com/AmandaLeopoldoo)
- LinkedIn: [Amanda Leopoldo](https://linkedin.com/in/amanda-leopoldo)

## 📝 Licença

Este projeto está sob a licença MIT.

---

⭐ **Gostou do projeto? Deixe uma star!** ⭐