package lotto.domain;

import lotto.utils.LottoNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoGame {
    private final List<Lotto> lottoTickets;

    public LottoGame(int purchaseAmount){
        this.lottoTickets = generateLottoTickets(purchaseAmount);
    }

    public List<Lotto> generateLottoTickets(int purchaseAmount){
        List<Lotto> lottos = new ArrayList<>();

        for (int i = 0; i < purchaseAmount; i++){
            lottos.add(new Lotto());
        }
        return lottos;
    }

    public List<Lotto> getLottoTickets(){
        return this.lottoTickets;
    }


}
