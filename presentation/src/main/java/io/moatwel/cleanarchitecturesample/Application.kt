package io.moatwel.cleanarchitecturesample

import android.app.Application
import io.moatwel.data.repository.DiskTokenRepository
import io.moatwel.domain.usecase.AuthUseCase

class Application : Application() {

  override fun onCreate() {
    super.onCreate()

    // 実際にどこからデータを取得するかは、DiskTokenRepositoryに担わせる。
    val diskTokenRepository = DiskTokenRepository(this)
    // DiskTokenRepositoryのインスタンスをInject
    val authUseCase = AuthUseCase(diskTokenRepository)
    authUseCase.loadToken()
  }
}