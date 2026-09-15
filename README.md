# Quazi for JetBrains IDEs

This IntelliJ Platform plugin registers `.qz` and starts one project-wide
`qz lsp` process when a Quazi file opens. Build it with Gradle 9+ and JDK 21
using `gradle build`, then install the ZIP from `build/distributions` with
**Install Plugin from Disk**. A Gradle wrapper is intentionally not bundled;
use your managed Gradle 9 installation.

`qz` must be on the IDE environment's `PATH`. The server feature contract is
canonical at [quazistrap/docs/tooling/lsp.md](https://github.com/quazilang/quazistrap/blob/main/docs/tooling/lsp.md).

JetBrains exposes this LSP API in its supported commercial IDE products; it is
not available in IntelliJ IDEA Community or Android Studio.
