# Global Solution: gs-0-talent-platform

Este repositório contém a implementação da API para a Global Solution 2025, focada no Tema 0: "Plataformas que conectam talentos a projetos com propósito".

A solução consiste em uma API RESTful em Java Spring Boot, dockerizada e integrada a uma pipeline completa de CI/CD (Versioning, CI, CD) usando GitHub Actions.

## I. Informações do Aluno

| Nome Completo | RM |
| :--- | :--- |
| Lucas de Alencar Pereira | 551720 |

## II. Descrição do Tema e API

| Tópico | Detalhe |
| :--- | :--- |
| **Tema Escolhido (0)** | Plataformas que conectam talentos a projetos com propósito. |
| **Finalidade da API** | A API retorna um JSON com os dados do tema, nome do membro e uma descrição. Ela demonstra a criação de um endpoint único (`GET /info`), dockerizado e configurado na porta `8081`. |
| **Documentação** | O Swagger (OpenAPI) está acessível em: `/swagger-ui.html`. |

## III. Pipeline CI/CD (GitHub Actions)

A pipeline automatiza os processos de teste, versionamento e entrega.

| Workflow | Tipo | Gatilho | Descrição do Workflow |
| :--- | :--- | :--- | :--- |
| **3. Versioning (Release)** | Versionamento | `push` na `main` | Gera automaticamente a **Tag** e a **Release** no GitHub. |
| **1. Continuous Integration** | CI | `push` (`develop`, `feature/*`, `release`, `hotfix`) | Executa o *Build* da aplicação, Testes Unitários e verifica o *Build* da imagem Docker. |
| **2. Continuous Delivery** | CD | `pull_request` na `develop` | Faz o *Build* da imagem Docker e o **Upload** para o Docker Hub. |

## IV. Instruções de Execução Local

### Pré-requisitos
* Docker Desktop (instalado e em execução).

### Execução do Contêiner
A imagem publicada pode ser executada diretamente, mapeando a porta `8081`:

```bash
docker run -p 8081:8081 alencaralho/gs-0-talent-platform:latest