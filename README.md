# growth-cat-server

## 開発環境

OS

- windows10

IDE

- Intellij

JDK

- openJDK 11

gradle

- 4.10.3

## 設定

全てIntellijを使用している前提での記載となる。

### build設定

- `File -> settings... -> Build,Execution,Deployment -> Compiler -> Annotation Processors`を選択
- `Enable annotation processing`にチェックを入れる
- `Store generated sources relative to:`項目で`Module content root`を選択
- `Production sources directory:`項目で`gen\production`を入力
- `Test sources directory:`項目で`gen\test`を入力

