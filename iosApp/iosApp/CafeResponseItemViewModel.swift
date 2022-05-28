//
//  CafeResponseItemViewModel.swift
//  iosApp
//
//  Created by 楊朝富 on 2022/5/24.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

class CafeResponseItemViewModel: ObservableObject {
    
    @Published var cafeResponseItemList = [CafeResponseItem]()
    
    private var repository: DataRepository
    
    init(repository: DataRepository) {
        self.repository = repository
    }
    
    func fetch(city: String) {
        repository.fetchCafesFromNetwork(cityName: city) { result, error in
            if let result = result {
                self.cafeResponseItemList = result
                KMMLogger().i(tag: "CafeResponseItemViewModel", message: "Cafe in \(city) was got!")
            }
        }
    }
}
