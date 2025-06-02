# ⚖️ Weight Converter in Java

> 🇺🇸 A clean and educational command-line Java application for unit conversion between common weight measures.  
> 🇧🇷 Um aplicativo Java limpo e educativo em linha de comando para conversão entre unidades de peso.

---

## 📌 Overview | Visão Geral

This project is a **terminal-based Java application** built for converting between the most common weight units. It was designed as a learning tool for beginners and a clean example of good programming practices, including:

- ✅ `switch-case` usage
- ✅ Proper `Scanner` input handling
- ✅ Clean formatting with `System.out.printf`
- ✅ Modular logic and readability

---

Este projeto é uma aplicação Java **executada no terminal**, desenvolvida para converter entre as unidades de peso mais utilizadas. Ele serve como ferramenta de aprendizado e como um exemplo claro de boas práticas de programação, incluindo:

- ✅ Uso adequado de `switch-case`
- ✅ Leitura segura com `Scanner`
- ✅ Saída formatada com `System.out.printf`
- ✅ Lógica modular e código limpo

---

## 🔁 Supported Conversions | Conversões Suportadas

| From (De) | To (Para) | Formula                                |
|-----------|-----------|----------------------------------------|
| lb        | kg        | `kg = lb × 0.453592`                   |
| kg        | lb        | `lb = kg ÷ 0.453592`                   |
| kg        | g         | `g  = kg × 1000`                       |
| oz        | g         | `g  = oz × 28.3495`                    |
| t         | kg        | `kg = t × 1000`                        |

---

## 🧪 Technologies Used | Tecnologias Utilizadas

- 🧠 Java 17+
- 💡 IntelliJ IDEA (IDE recomendada)
- 🛠️ Java Standard Library
- 🔃 Git & GitHub para controle de versão

---

## 🚀 How to Run | Como Executar

### ▶️ Terminal or IntelliJ IDEA

1. **Clone this repository**  
   ```bash
   git clone https://github.com/brunosoutocs/weight-converter-java.git
2.Open the project in IntelliJ IDEA
Ou em qualquer outra IDE compatível com Java.

3.Compile and run the file WeightConverter.java.

4.Use the menu
Selecione a opção desejada (1 a 5) e forneça o valor solicitado.

🎯 Learning Goals | Objetivos de Aprendizado
🇺🇸 This project was built to reinforce key Java skills in real-world command-line development.
🇧🇷 Este projeto foi criado para reforçar habilidades essenciais em Java no desenvolvimento de aplicações reais via terminal.

Topics explored:

Reading user input

Type conversion (double)

Arithmetic with measurement units

Clean and readable output formatting

Error handling with default case in switch;


💡 Future Improvements | Melhorias Futuras
🔄 Add support for more units (e.g. mg, stone)

🌐 Add a multilingual option (menu in Portuguese and English)

🖥️ Migrate to a GUI version using JavaFX or Swing

📦 Modularize the logic into methods or classes;

📜 License | Licença
MIT License. Feel free to use, study, modify, and distribute this project.

🤝 Contribute | Contribua
Pull requests are welcome! If you'd like to add more features, feel free to fork the repo and submit changes.
