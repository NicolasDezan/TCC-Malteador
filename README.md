# Estrutura do TCC

## Resumo (150–250 palavras)
📌 *`O que incluir?`*
- Contexto: importância da malteação e desafios de automação em climas quentes.
- Objetivo: desenvolvimento de firmware e aplicativo para controle do malteador.
- Metodologia: simulação de sensores/atuadores via ESP32, desenvolvimento do app Android.
- Resultados esperados: software funcional, controle assíncrono, modularidade didática.
- Limitações: sem integração física/testes experimentais.
- Aplicabilidade futura: otimização experimental e uso didático.

🔹 Palavras-chave: Automação, Malteação, Firmware, Aplicativo, Controle de Processos.

## Introdução

### Contextualização
- A importância do malte no setor industrial (cervejeiro, alimentício, etc.).
- O desafio da malteação em climas quentes.
- A necessidade de controle preciso de temperatura, umidade e tempo.

### Problema de Pesquisa
- Falta de equipamentos acessíveis para malteação controlada em laboratório.
- Protótipo inicial não funcional desenvolvido na IC (deficiências em sensores e automação).
- Necessidade de um sistema de controle confiável e didático.

### Justificativa
- **Acadêmica:** Ferramenta de ensino para o LACEMP-IFES.
- **Técnica:** Controle automatizado pode melhorar a qualidade do malte produzido.
- **Econômica:** Solução de baixo custo baseada em ESP32 e Kotlin.

## Objetivos

### Objetivo Geral
*Desenvolver um firmware (ESP32) e um aplicativo (Android) para simular e gerenciar o processo de malteação em laboratório.*

### Objetivos Específicos
- *Criar um firmware para ESP32, simulando sensores e atuadores.*
- *Implementar algoritmos assíncronos para controle das etapas do processo.*
- *Desenvolver um aplicativo Android para configuração e monitoramento.*
- *Documentar o código e criar tutoriais didáticos para outros projetos.*

## Revisão Bibliográfica

### O Processo de Malteação
- Etapas: Maceração → Germinação → Secagem.
- Reações químicas envolvidas:
  - **Maceração:** Hidratação do grão e ativação de enzimas.
  - **Germinação:** Conversão de amido em açúcares fermentáveis.
  - **Secagem:** Desenvolvimento de compostos aromáticos (Maillard, pirazinas).

### Importância do Controle de Variáveis no Processo
- Como temperatura, umidade e CO₂ afetam a qualidade do malte.

### Automação na Indústria Química
- Uso de sensores e atuadores no controle de processos industriais.
- Benefícios da automação: padronização, eficiência e reprodutibilidade.

### ecnologias Utilizadas
- ESP32 e MicroPython: Vantagens para ensino e automação.
- Bluetooth vs. Wi-Fi: Justificativa para escolha do Bluetooth.
- Lógica PID: Conceito e aplicações no controle de processos.

## Metodologia

### Desenvolvimento do Firmware
- **Linguagem:** MicroPython no ESP32.
- Implementação de sensores simulados (temperatura, umidade, CO₂).
- Algoritmos assíncronos para controle das etapas da malteação.
- Implementação do controle PID.

### Desenvolvimento do Aplicativo Android
- **Linguagem:** Kotlin + SQLite.
- **Interface gráfica e funcionalidades:**
  - Envio de parâmetros via Bluetooth.
  - Monitoramento dos dados simulados.

### Estrutura de Documentação e Código
- **GitHub:** Repositório separado para firmware e app.
- **Tutoriais:** Criação de vídeos explicando a integração Bluetooth.

### Limitações do Estudo
- Não inclui montagem física ou validação experimental.
- Apenas simulação do processo, sem testes reais com malteação.

## Resultados e Discussão
📌 *`O que incluir se não houver testes físicos?`*

### Resultados Esperados
- Firmware e aplicativo funcionais para simulação do malteador.
- Controle das etapas via algoritmo assíncrono e lógica PID.
- Código modular para facilitar adaptação em outros projetos.

### Comparação com Dados da Literatura
- Comparação das variáveis simuladas com dados reais da malteação.
- Análise teórica: impacto do controle automatizado na qualidade do malte.

### Possibilidades de Melhorias
- Implementação em hardware real.
- Validação experimental com diferentes tipos de grãos.
- Integração com sensores reais no futuro.

## Conclusão
📌 *`Resumo final do trabalho`*

- **O que foi desenvolvido?** Firmware e aplicativo.
- **Qual a importância?** Ferramenta didática e controle de processos.
- **Quais são as limitações?** Falta de testes físicos e validação experimental.
- **O que pode ser feito no futuro?** Montagem física e otimização do processo.