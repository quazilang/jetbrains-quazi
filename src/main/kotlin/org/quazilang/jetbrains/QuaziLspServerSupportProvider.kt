package org.quazilang.jetbrains

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class QuaziLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
        if (file.extension == "qz") serverStarter.ensureServerStarted(QuaziLspServerDescriptor(project))
    }
}

private class QuaziLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Quazi") {
    override fun isSupportedFile(file: VirtualFile) = file.extension == "qz"
    override fun createCommandLine() = GeneralCommandLine("qz", "lsp")
}
