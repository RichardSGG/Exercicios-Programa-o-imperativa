# Ajustes aplicados - Lista1ponto

Resumo das correcoes implementadas apos comparar as solucoes com o PDF `lista_exercicios_java.pdf`.

## Questoes ajustadas

- `Q2`: leitura de notas com `nextDouble()`, mensagens padronizadas e media formatada com duas casas decimais.
- `Q3`: saida alinhada ao enunciado com `Novos precos:`, precos na mesma linha e totais formatados com `%.2f`.
- `Q5`: as tres linhas do resultado agora sao sempre exibidas, inclusive quando o crescimento consecutivo e `0`.
- `Q11`: mantido correto com o cabecalho `Matriz transposta:`.
- `Q12`: mantido correto com o cabecalho `Matriz reorganizada:`.
- `Q15`: validacao da diagonal principal corrigida e maior valor buscado apenas fora da diagonal.
- `Q17`: calculo da maior soma contigua ajustado para tambem funcionar em linhas e colunas com todos os valores negativos.
- `Q18`: escolha do maior pico corrigida para nao depender de `maior = 0`, com tratamento explicito para ausencia de picos.

## Casos de teste sugeridos

- `Q2`: usar a entrada do exemplo com notas decimais.
- `Q3`: validar o formato exato da saida do exemplo.
- `Q5`: testar uma sequencia sempre decrescente.
- `Q15`: testar uma matriz com elemento nao nulo na diagonal e maior valor fora dela.
- `Q17`: testar pelo menos um caso com todos os valores negativos.
- `Q18`: testar uma matriz com picos negativos e outra sem nenhum pico.
