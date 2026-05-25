# Calculadora em Java

Uma calculadora simples baseada em console desenvolvida em Java. O programa roda em um loop contínuo, permitindo que o usuário realize várias operações matemáticas básicas até que decida sair.

---

## Como o código funciona?

O programa utiliza a classe `Scanner` para ler os dados que você digita no teclado e funciona seguindo estes passos:

1. **Entrada de Dados:** O programa pede para você digitar o **primeiro número** e o **segundo número** (aceita números com vírgula/ponto, pois usa o tipo `double`).
2. **Menu de Opções:** Um menu é exibido na tela para você escolher qual operação deseja realizar.
3. **Processamento (`switch-case`):** O código analisa a sua escolha:
   * **1:** Soma os dois números.
   * **2:** Subtrai o segundo número do primeiro.
   * **3:** Multiplica os dois números.
   * **4:** Divide os números (com uma validação que impede a divisão por zero, evitando que o programa quebre).
   * **5:** Encerra a execução do programa.
4. **Repetição (`while`):** Após mostrar o resultado, o programa recomeça e pede novos números, parando apenas se você digitar a opção `5`.

