package io.moatwel.domain.repository

/**
 *  This class control Auth data.
 *
 *  This class defined to CRUD for Auth data.
 *  A class implemented this class will do get Auth data.
 */
interface TokenRepository {
  fun getToken()
  fun saveToken(token: String)
  fun removeToken()
  fun loadToken()
}
