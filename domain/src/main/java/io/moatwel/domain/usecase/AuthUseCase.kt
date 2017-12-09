package io.moatwel.domain.usecase

import io.moatwel.domain.repository.TokenRepository

class AuthUseCase(
  private val tokenRepository: TokenRepository) {

  /**
   * get token
   * but this class do not know how to get token.
   * ex; API or Disk
   */
  fun getToken() {
    tokenRepository.getToken()
  }

  fun saveToken(token: String) {
    tokenRepository.saveToken(token)
  }

  fun removeToken() {
    tokenRepository.removeToken()
  }

  fun loadToken() {
    tokenRepository.loadToken()
  }
}