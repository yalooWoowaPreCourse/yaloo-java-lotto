package lotto.domain;

import lotto.utils.LottoNumbersGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoGame {
    private final List<List<Integer>> lottoTickets;

    public LottoGame(int purchaseAmount){
        this.lottoTickets = generateLottoTickets(purchaseAmount);
    }

    public List<List<Integer>> generateLottoTickets(int purchaseAmount){
        List<List<Integer>> lottoTickets = new ArrayList<>();

        for (int i = 0; i < purchaseAmount; i++){
            lottoTickets.add(new Lotto().lottoNumbersGenerator());
        }
        return lottoTickets;
    }

    public List<Integer> getLottoTicket(int index){
        return this.lottoTickets.get(index);
    }

    public List<List<Integer>> getLottoTickets(){
        return this.lottoTickets;
    }


}
