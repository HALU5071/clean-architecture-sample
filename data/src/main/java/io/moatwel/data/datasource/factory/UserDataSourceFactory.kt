package io.moatwel.data.datasource.factory

import io.moatwel.data.datasource.CloudUserDataSource

class UserDataSourceFactory {

  fun createCloudUserDataSource(): CloudUserDataSource {
    return CloudUserDataSource()
  }
}